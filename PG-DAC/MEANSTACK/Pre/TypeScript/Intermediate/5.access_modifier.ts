      //  Class Access Modifiers
      //  public (Default) private protected
      //  Applicable to Fields, Properties and Methods

    class Point {
    private x: number;           //Fields for storing data
    private y: number;

    //  constructor(x: number,y:number) {
    
        constructor(x?: number,y?:number) {
                this.x = x;
                this.y = y;
        }

        draw (){            //can access class variables
            console.log('X: ' + this.x + ', Y: ' + this.y)
        }
    }

    //Object is instance of Class
    // let point = new Point(1,2);
    let point = new Point(1,2);          //Allocate Memory with new otherwise error
   
    // point.x = 3;        //Error

    point.draw();
