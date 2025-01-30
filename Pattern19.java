public class Pattern19{
    public static void main(String[] args){
        int n=4;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){//j(colums) value is dependent on the i(rows) 
                System.out.print("*");//use print statement for execution , whenre printLn prints the statementd in new line.
            }
            System.out.print("\n");
        } 
    
}
}