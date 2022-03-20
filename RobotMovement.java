import java.util.Scanner;
public class RobotMovement {
    public String moveRobot(int i1, int i2, String i3, String i4){
        int x=Integer.parseInt(i3.substring(0,1));
        int y=Integer.parseInt(i3.substring(2,3));
        String d = i3.substring(4,5);
        if(x<i1 & y<i2){int a = 0,b=0;
            for(int i=0;i<i4.length();i=i+2){a=x;
                b=y;
                if(i4.charAt(i)=='R' && ((x<=i1 | x>=0)|(y<=i2 | y>=0))){
                    if(d.equals("E")){
                        d="S";
                    }
                    else if(d.equals("W")){
                        d="N";
                    }
                    else if(d.equals("N")){
                        d="E";
                    }
                    else if(d.equals("S")){
                        d="W";
                    }
                }
                else if(i4.charAt(i)=='L'&& ((x<=i1 | x>=0)|(y<=i2 | y>=0))){
                    if(d.equals("E")){
                        d="N";
                    }
                    else if(d.equals("W")){
                        d="S";
                    }
                    else if(d.equals("N")){
                        d="W";
                    }
                    else if(d.equals("S")){
                        d="E";
                    }
                }
                else if(i4.charAt(i)=='M'&& ((x<=i1 | x>=0)|(y<=i2 | y>=0))){
                    if(d.equals("E")){
                        x=x+1;
                    }
                    else if(d.equals("W")){
                        x=x-1;
                    }
                    else if(d.equals("N")){
                       y=y+1;
                    }
                    else if(d.equals("S")){
                        y=y-1;
                    }
                }
            }
            if((x>i1 | x<0)|(y>i2 | y<0)){
                i3=a+"-"+b+"-"+d+"-ER";
            }
            else{
                i3=x+"-"+y+"-"+d;
            }
        }
        return i3;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RobotMovement obj = new RobotMovement();
        System.out.println(obj.moveRobot(s.nextInt(), s.nextInt(), s.next(), s.next()));
    }
}