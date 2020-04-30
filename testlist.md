Modélisation du déplacement du véhicule
Pour se déplacer
    - direction
    - robot

 

 

// liste des tests
1. Verifier que le robot initiale du robot est (0,0) et direction N

 

2. Etant donné une robot, si je déplace le robot alors j'attends d'avoir une robot donnée
    Test 1 : (move Forward)
        robot initiale :   (0,0,N)
        action : F
        Attendu (0,1,N)

 

    Test 2 : (rotate to R)
        robot initiale :   (0,0,N)
        action : R
        Attendu (0,0,E)

 

    Test 3 : (move Backward  and rotate to L)
            robot initiale :   (3,3,N)
            action : BL
            Attendu (3,2,W)

 

    Test 4 : (move Backward  + rotate R + move forward twice )
                robot initiale :   (-5,8,N)
                action : BRFF
                Attendu (-3,7,E)

 


    Test 5 : (move Forward  )
                    robot initiale :   (-10,0,W)
                    action : F
                    Attendu (10,0,W)

 

Protocole ZX81:

  Test 1 : Rotate To Left
    robot initiale :   (0,0,N)
                        action : A
                        Attendu (0,0,W)
                        
  Test 1 : Rotate To Left
      robot initiale :   (0,0,N)
                          action : A
                          Attendu (0,0,W)

