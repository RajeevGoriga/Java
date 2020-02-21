<!DOCTYPE html>
<html>
<body>

<h2>JavaScript String Methods</h2>

<p>	Search for a text in string and return the text if found.</p>

<p id="demo"></p>

<script>
var str = "Please locate where 'locate' occurs!";
var position = str.search("locate");
document.getElementById("demo").innerHTML = position;
</script>

</body>
</html>
