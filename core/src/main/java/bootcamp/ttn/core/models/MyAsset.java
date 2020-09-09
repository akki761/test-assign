package bootcamp.ttn.core.models;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.dam.api.Asset;
import com.day.cq.dam.api.Rendition;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;

public class MyAsset extends WCMUsePojo {
    private String imagePath;

    @Override
    public void activate() throws Exception {
        Resource currentResource = getResource();
        ResourceResolver resourceResolver = getResourceResolver();

        ValueMap valueMap = currentResource.getValueMap();
        String path = (String) valueMap.get("path");
        String[] dimensions = ((String) valueMap.get("resolution")).split(":");
        Resource imgResource = resourceResolver.getResource(path);
        Asset imgAsset = imgResource.adaptTo(Asset.class);
        if(imgAsset!=null){
            String userResolution = dimensions[0]+"."+dimensions[1] + ".png";
            imagePath = imgAsset.getOriginal().getPath();
            for (Rendition rendition : imgAsset.getRenditions()) {
                String renditionPath = rendition.getPath();
                if(renditionPath.endsWith(userResolution)){
                    imagePath = renditionPath;
                }

            }
        }



    }


    public String getImagePath() {
        return imagePath;
    }
}
