    //  Class Access Modifiers in Constructor
    //   public (Default) private protected
    //  Applicable to Fields, Properties and Methods
    
    
        class Point {

        //    constructor(public x?: number,public y?:number) {
            constructor(private x?: number,private y?:number) {
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
