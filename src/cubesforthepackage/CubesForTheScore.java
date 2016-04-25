/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubesforthepackage;

/**
 *
 * @author Mark
 */
public class CubesForTheScore {
    
    CubesForTheJFrame frame;
    
    int[] dieValues = new int[5];
    
    int score = 0;
    
    public void getDieValues(){
        for(int i = 0; i < 5; i++){
            dieValues[i] = frame.dice.get(i).getDieVlue();
        }
    }
    
    public int score(int selectedOption){
        getDieValues();
        
        return score;
    }
    
}
