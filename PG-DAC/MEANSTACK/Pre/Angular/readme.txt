Angular:
	1. Components
	2. Templates
	3. Directives
	4. Services

Building Blocks:
	
	- One or More Components
		-Data
		-HTML Template		
		-Business Logic
			E.g Website Has
				-Side Bar As Componets
				-Navbar As Components
				-Courses As Components
					- One or More Courses (Courses Divided in Smaller Component)
						-Each Course has Rating as Sub-Components 
						(Reused for Other Courses Too)


	- Every App has App or Root Component
	- Each Components Linked to This Root Component (Represented as Tree)

	- Module has Group of Related Component
	- Each App has atleast one Module (Named as App)
		E.g LMS Website has
			-Courses Module
			-Messaging Module
			-Instructor Module
			-Admin Module
	- Each App module divided into smaller module;


//Get Started (3. Angular Fundamental)
	Components
		- Create
		- Register it in a Module
		- Add an element in an HTML Markup
	Decorator
		//Convert Class to Component using decorator (component)
		//Make Class a Component
		@Component
	Template
		Adding Dynamic Content (Tags) and Angular Directive inside HTML via Component
	Service
		- To get data from HTTPservice and place it to presentation logic i.e component (class) through service class
		- It is plain class so no decorator needed
	Dependency Injection:
		- Register the above service class in module into providers array
		- Pass it via cnstr of componet class
		- @Injectable

//Handling Event (4.)
	Property Binding
		title="text"  -- in component			{{text}} 	--interpolation inside tag as value
		imageurl="url"	-- in component			<img [src]="imageurl" />  	--in tag as attribute
	Attribute Binding
		colspan="2"	--in component			[attr.colspan]="colspan"	-- in tag as attr
	Class Binding

	Style Binding

	Event Binding
		(click)="method($event)"				//Inside Tag
		-> Event Bubbling
				$event.stopPropagation();	
			
		(keyup.enter)="method()"		//.enter is event filtering		//Inside Tag
	
	Template Variable
		#email		(keyup.enter)="method(email.value)"	

	Two-Way Binding
		1) In Property Binding Direction of Binding moves from Components to View	
		   Example : One Way Binding
			[value]="email"		(keyup.enter)="method()"			//Inside Tag
			email="hi@domain.com";							//Inside Component	
		2)	
		   Example : Two Way Binding		(Import Form Model in model.ts under imports)
			[(ngModel)]="email"		==Banana in the Box===

	Pipe	(Check Pipe in documentation in particular package in particular module)
		{{ title | uppercase | lowercase }}
		{{ amount | number | currency:'INR':true:'3' }}	//:stands for arguments //true for symbol //3 digits after decimal
		{{ score | number:'1.3-2' }}   // min - 1 max -3 digits	in decimal place
				   1.1-1	//Will Round Off the Number
				   2.1-1	//zero preceding
		{{ reg | date:"shortDate" }}

	Custom Pipe
		-> Create summary.pipe.ts
		-> Import Pipe & PipeTransform Decorator Function
		-> Implement transform method with arguments and return final result.


// Reusable Component (5)
	1) Input Property = Pass State to Component			= Property Binding
		Import = Input from core Library
		Use annotation @Input() for fields and properties
Option:-	Supply alias @Input('is-favourite') helpful to keep contract (Even if property name is changed in component it wont 		affect)
		Make necessary changes in component template
	2) Output Property = to raise an event on change		= Event Binding
		Import = Output decorator function & EventEmitter	
		Use annotation @Output() change  =  new EventEmitter(); 	(change)="method()"	
		Make use of emit() method;		to detect and raise an event
		Implement method() in App Component
Optional:-	@Output('change')			-- To Keep Component API Stable for other comp to use
	3) Pass the Data
		Pass the property/state by passing as arg in emit(this.valueData); of Custom Component
		Get the property/state method(valueData) in App Component 
		(App Comp has subscribed to Custom Comp and Knows every changes happening there)
	4) Interface in Custom Component to Pass an Object
		emit( newValue : this.valueDate)			-- Custom Component
		method( eventArgs : FavouriteChangedArgs)		//FavouriteChangedArgs is Interface

		In Custom Component Define Interface
			export interface FavouriteChangedArgs {
				newValue: boolean
			}
	5) If template html is large can have a separate file and Add in component as
			templateURL:
	   or write the html code for smaller things if upto 5 lines in
			template:
//Optional:-
	6) If more css file can add their url in the array of
			styleUrls:
	   if small line of css code
			styles: [ ` write here `]			//This will be ignore if added along with styleUrls;
		
	
	IMP: If template of another.comp has similar tag <h1> as this.comp i.e <h1> and we apply style to the tag <h1> of this.comp, then it will not get applied to tag <h1> of another.comp . [safe] called Shadow DOM
		In Javascript ShadowDom
		var e1 = element.createShadowRoot();	--	e1.innerhtml=``;

	As most old browsers don't support ShadowDom so inside Component annotation add the line
		encapsulation: ViewEncapsulation.Emulated
	
	7)	<ng-content>		(No Need of Selector if we have ng-content) (Panel Component) 
			(Used Inside Fixed Templates using Bootstrap i.e Material Cards)
			Attr:  		select="name"
		
		In Another Component
			To inject value into ng-content from consumer (App Component)
				<div class="name">value</div>

	8) If want to render without putting inside div use <ng-container>

//Directives (6.)


		
