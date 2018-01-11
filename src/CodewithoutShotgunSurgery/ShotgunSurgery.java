/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodewithoutShotgunSurgery;

/**
 *
 * @author User
 */
public class ShotgunSurgery {
      
       public static void main(String[] args) throws Exception {
              AcountRefactored acc = new AcountRefactored("Personal","AC1234",1000);
              acc.debit(500);
              acc.sendWarningMessage();
              //acc.debit(500);
       }

}
