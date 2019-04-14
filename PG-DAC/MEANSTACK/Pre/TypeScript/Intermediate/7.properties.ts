//  Properties

    class Point {
        //Press F2 and Rename so everywhere it is replaced
        constructor(private _x?: number,private _y?:number) {
        }

        draw (){
            console.log('X: ' + this._x + ', Y: ' + this._y)
        }

        get x()  {
            return this._x;
        }

        set x(value)  {
            if(value < 0)
                throw new Error("Less than Zero")
            
            this._x = value;
        }

        /*    OLDER VERSION
        //Getter
        getX()  {
            return this.x;
        }
        //Setter
        setX(value)  {
            if(value < 0)
                throw new Error("Less than Zero")
            
            this.x = value;
        }
        */
        
    }


       let point = new Point(1,2);
        let x = point.x;
        point.x = 10;
        //let x = point.getX();
        //point.setX(10);
        point.draw();
