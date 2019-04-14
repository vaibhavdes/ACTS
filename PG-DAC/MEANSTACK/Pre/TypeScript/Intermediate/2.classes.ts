      //Execute      :       tsc main.ts && node main.js
      //  Classes (Properties + Methods) (Variables + Functions)
      //Cohesion = Related things should be part of one unit and together
      
      //  2
          class Point {
              x: number;           //Fields for storing data
              y: number;

              draw (){            //can access class variables
                  console.log('X: ' + this.x + ', Y: ' + this.y)
              }
              getDistance(another: Point){
                  //stmts
              }
          }
      
      //  1
          interface Point {           //Interface contains Signatures of Function
          x: number,
          y: number,
          draw: () => void           //Only Declaration and Definition at other place
          }
      
