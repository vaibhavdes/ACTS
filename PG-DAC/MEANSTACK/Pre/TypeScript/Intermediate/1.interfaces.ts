          //Interfaces (Are Purely for Declaration)

          //  If more parameters passed   - Problem
          
          //1.    
          let drawPoint = (x,y,a,b,c,d,e) => {
              //statements
          }

                                           //Solution
          //6.   
          interface Point {
              x: number,
              y: number
          }

          //5.   
          let drawPoint = (point: Point) =>{
              //stamtement
          }

          //4.  
          let drawPoint = (point) =>{
              //stmts
          }
          
          //  Innline Annotations
          //3.    
          let drawPoint = (point : number) =>{
               //stmts
           }
           
           
          //2
          drawPoint({
                  x:1,
                  y:2,
                  a:3,
                  b:4
              })
              
