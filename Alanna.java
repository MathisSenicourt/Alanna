public class Alanna {
    public static void main (String[] arg) {
        final float h = Float.parseFloat(arg[0]);
        final float bounce = Float.parseFloat(arg[1]);
        final float window = Float.parseFloat(arg[2]);
        int res = -1;
        if(!(h > 0 )){
            show(h, bounce, window, res);
            condition(1);
        } 

        else if((bounce >= 1 ) || ( bounce <= 0)){
            show(h, bounce, window, res);
            condition(2);
        } 

        else if(!(window<h)||!(window>0)){
            show(h, bounce, window, res);
            condition(3);
        }

        else{
            float tmp = h;
            res = 1;
            while((tmp*bounce)>window){
                tmp = tmp*bounce;
                res=res+2;
            }
            show(h, bounce, window, res);
        }
    }

    private static void show(float h, float bounce, float window, int res){
        System.out.println("- h = "+h+", bounce = "+bounce+", window = "+window+", result is "+res);
    }

    private static void condition(int cond){
        System.out.println("(Condition "+cond+" not fulfilled)");
    }
}