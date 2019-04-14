
export  class FBLike {
    
        constructor(private _likes: number, private _isSelected: boolean){
        }

        onClick(){

            this._likes += (this._isSelected) ? -1 : +1;
            this._isSelected = !this._isSelected;
        }    
        /*    if(this.isSelected){
                this.likes--;
            }
            else{
                this.likes++;
            }
        */
           
        get likesCount() {
            return this._likes;
        }

        get isSelected() {
            return this._isSelected;
        }
        
    }
