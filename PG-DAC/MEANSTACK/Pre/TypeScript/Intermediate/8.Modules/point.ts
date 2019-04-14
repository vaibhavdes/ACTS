      //Export to Allow Use of Class outside this file
      //This File as Modules

      //Export for Classes,Function,Variable,Object

      export class Point {
              constructor(private _x?: number,private _y?:number) {         
              }

              draw (){           
                  console.log('X: ' + this._x + ', Y: ' + this._y)
              }
          }
