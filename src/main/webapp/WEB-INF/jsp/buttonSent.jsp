<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Color Message was sent!</title>
</head>
<body>
  <h1>Color message was sent! ${red},${green},${blue}</h1>
</body>


<script>
    // Using ES6 feature.
    let redirect_Page = () => {
        let tID = setTimeout(function () {
            window.location.href = "/gobutton?red=${red}&green=${green}&blue=${blue}";
            window.clearTimeout(tID);		// clear time out.
        }, 1000);
    }

    // Using regular methods.
    /* function redirect_Page () {
        var tID = setTimeout(function () {
            window.location.href = "https://www.encodedna.com/javascript/operators/default.htm";
            window.clearTimeout(tID);		// clear time out.
        }, 5000);
    } */
    redirect_Page();
</script>
</html>