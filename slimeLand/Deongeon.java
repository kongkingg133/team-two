package slimeLand;
import java.util.Scanner;
import slimeLand.Character.Warrior01;
import slimeLand.Character.monster;
import slimeLand.Item.HpPotion;
import slimeLand.Item.Weapon;


public class Deongeon {
    private static Scanner sc = new Scanner(System.in);

    
    
    public static void main(String[] arg) {
        boolean run = true;
        boolean flag = false;
        boolean run1 = true;

        
        Warrior01 warrior01 = new Warrior01("전사", 300, 200, 1,0 );
        monster slimeRed = new monster("빨간슬라임", 100 ,40);
        Weapon longs = new Weapon("롱스워드", 300, 0, 10);
       
        //게임시작
            
        while(run){
            menu.Startmenu();
            int choice = sc.nextInt();
            //게임종료
                if(choice == 3){while(true) {
                
                System.out.println("종료하시겠습니까? [Y/N]");
                String ESC_ans = sc.next();

                if(ESC_ans.equals("N")||ESC_ans.equals("n")){
                flag = false;
                break;
                }
                if (ESC_ans.equals("Y")||ESC_ans.equals("y")){
                flag = true;
                break;
                }
                else if(!(ESC_ans.equals("Y")||ESC_ans.equals("y")
                ||ESC_ans.equals("N")||ESC_ans.equals("n"))){
                    System.out.println("다시 입력해라 ");
                }
                }
               if(flag) break;}
            //전투시작(전사) 
               while(run1){
                if(choice == 1){
                sc.nextLine();
                menu.campmenu();
                int choice2 = sc.nextInt();
                run = true;
                while(run){
                switch(choice2)
                {
                case 1: 
                menu.fightmenu();
                    int fchoice = sc.nextInt();
                    switch(fchoice){
                        case 1:
                        if(slimeRed.hp > 0){
                            slimeRed.dmg(warrior01.BasicAttack());
                            slimeRed.info();
                            warrior01.dmg(slimeRed.att());
                            warrior01.info();
                           
                            if(slimeRed.hp > 0){
                               break;    
                            }
                            else if(slimeRed.hp < 1){
                                System.out.println("슬라임 잡기 성공!");
                                System.out.println("첫번째 스테이지 클리어");
                                warrior01.getExp(50);
                                warrior01.getitem(longs);
                                warrior01.getEquip(longs);
                                break;   
                            }
                               if(warrior01.hp > 0){
                                menu.campmenu();
                                break;
                            }
                            else if(warrior01.hp < 0 ){
                                System.out.println("GAME OVER");
                                menu.campmenu();
                                break;
                        
                            }
                            else{
                                System.out.println("전투가 종료 됐습니다");
                                menu.campmenu();
                                break;
                            }
                        }
                            case 2: 
                                slimeRed.dmg(warrior01.Slash());
                                slimeRed.info();
                                warrior01.dmg(slimeRed.att());
                                warrior01.info();
                          
                            if(slimeRed.hp > 0){
                              break;    
                            }
                            else if(slimeRed.hp < 1){
                                System.out.println("슬라임 잡기 성공!");
                                System.out.println("첫번째 스테이지 클리어");
                                warrior01.getExp(50);
                                warrior01.getitem(longs);
                                warrior01.getEquip(longs);
                                break;   
                            }
                            if(warrior01.hp > 0){
                                break;
                            }
                            else if(warrior01.hp < 0 ){
                                System.out.println("GAME OVER");
                                break;
                        
                            }
                            else{
                                System.out.println("전투가 종료 됐습니다");
                                break;
                               
                     
                        
                            }
                        case 3:
                        warrior01.inventory();
                        break;
                        case 4:
                        run = false;
                        if(run) break;

                        
                    }
                        
                case 2: 
                    warrior01.info();
                    break;
                  
                
                case 3: 
                    menu.Shopmenu();
                    int ichoice = sc.nextInt();
                    switch(ichoice){
                    case 1: if(warrior01.money > 50){ 
                    warrior01.hp += 30;
                    warrior01.money -=50;
                    }
                    case 2: 
                    if(warrior01.money > 50){
                    warrior01.mp += 30;
                    warrior01.money -=50;
                    }
                    case 3:
                    run=false;    
                    if(run) break;
            
                }
                case 4: 
                  run= false;    
                  if(run) break;
                
                
                case 5: 
               
            }
        }
    }
}
               
                    
                
            
                
                
        }
            //전투시작(마법사)   
            
    }
}
    

 
                
        
            

            

           

    


