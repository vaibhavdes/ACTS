
$(document).ready(function()
{
    $("#submit").click(function()
	{

		var name = $("#name").val();
		var price = $("#price").val();
		var rdate = $("#rdate").val();
		var bdate = $("#bdate").val();

		var dataString = 'n='+ name + '&p='+ price + '&r='+ rdate + '&b='+ bdate;
	  
		if( bdate < rdate)
		{
			alert("Booking Date should be Greater than Release Date ");
		}
		else
		{
			alert("Booking Successful");
			$.ajax
			({
				type: "POST",
				url: "./process.php",
				data: dataString,
				cache: false,
				success: function(result)
				{
					alert(result);
				}
			});
		}
		return false;
		}
	);
});