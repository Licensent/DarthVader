/**
 * Created by DarthVader on 03.09.2016.
 */
public class Calculator {
    public static void main(String[] args){
        String[] formulas = new String[] { "(2+2)*2", "(2+2)*2+(3-1)", "2+X*2", "2--4", "2**3*5-----7", "3.5.6-2"};
//        String[] formulas = new String[] { "2+2*2","(2+2)*2+(3-1)", "2+X*2", "sin(90)+4-cos(0)", "2--4", "2**3*5-----7", "3.5.6-2" };

        MatchParser p = new MatchParser();
        for( int i = 0; i < formulas.length; i++){
            try{
                System.out.println( formulas[i] + "=" + p.parse( formulas[i] ) );
            }catch(Exception e){
                System.err.println( "Error while parsing '"+formulas[i]+"' with message: " + e.getMessage() );
            }
        }
    }
}
