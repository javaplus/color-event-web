<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content=
        "width=device-width, initial-scale=1.0">
    <script type="text/javascript"></script>
    <link rel="stylesheet" href="style.css">
    <link href="https://fonts.googleapis.com/css2?family=Itim&display=swap" rel="stylesheet">
</head>

<body>

    <h1 class="mainTitle">Welcome to the color picker!</h1>    

    <div class="neumorphism-3"><h1 class="mainTitle"></h1></div>
    <form class="myform" action="/button">
        <div class="inpt">
            <label>Enter RGB Values 0 to 255:</label>
            <br/>
            <input type="number" id="red" name="red" value="${red}">
            <input type="number" id="green" name="green" value="${green}">
            <input type="number" id="blue" name="blue" value="${blue}">
            <br/>
            <button class="btn">Submit</button>
        </div>
        
    </form>
    <script src="script.js"></script>

</body>

</html>