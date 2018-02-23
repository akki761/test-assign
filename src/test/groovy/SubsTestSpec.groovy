// Q4)  Write a unit test case using spock blocks.

//when and then using setup, given & and blocks.

//expect using setup, given & and blocks.



import org.codehaus.groovy.control.messages.ExceptionMessage
import spock.lang.Specification

class SubsTestSpec extends Specification {

    def subtraction

    void setup(){
        subtraction=new Subtraction()
    }

    void "canaryTest"(){
        println "This is canary test"
        expect:
            true
    }


    void "testTheSubtractWithTwoInts"(){

        setup:
         def a=10
         def b=20


        when:
        def c=subtraction.sub(a,b)
        then:
        c==-1


    }







    void "testTheSubWithWrapperInt"(){

        given:

        def a=Integer.valueOf(4)
        def b=Integer.valueOf(3)


        when:
        def c=subtraction.subInt(a,b);
        then:
        c==1
    }


    void "testThrowsRuntime"(){

        given:
        def a=5
        def b=0

        when:
        subtraction.throwsRuntime(a,b)
        then:
        println "Exception"
    }



    void "testForMax"(){
        setup:
         def a=5
         def b=4

        expect:
        Math.max(a,b)==4
    }

    void "maximum of two numbers"(int a, int b, int c) {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        1 | 3 | 3
        7 | 4 | 7
        0 | 0 | 0
    }
}
