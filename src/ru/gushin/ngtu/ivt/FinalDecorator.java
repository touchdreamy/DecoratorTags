package ru.gushin.ngtu.ivt;

public class FinalDecorator extends Decorator {
    public FinalDecorator(ReturnClass component) {
        super(component);
    }

    @Override
    public StringBuilder sendBackLine() {
        String[] words = String.valueOf(component.sendBackLine()).split(" ");
        StringBuilder a = new StringBuilder();
        int b = 1;
        //  System.out.println(Arrays.toString(words));
        for (String line : words){
            if ("final".equals(line)){
                break;
            }
            b++;
        }
        int i = 0;

        for (String ln : words){

            if(b - i == 1){
                a.append("<i><strong> <font color='purple' face='Compact'>");
            }
            i++;

            if ("final".equals(ln)){
                a.append(ln);
                a.append("</font> </strong></i>");
                continue;
            }
            a.append(" ");
            a.append(ln);
        }

        return a;
    }
}
