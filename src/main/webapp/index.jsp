<html>
<head>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    >
    <script type="text/javascript">
        function portal() {
            var id = document.getElementById("studentId").value;
            var obj = JSON.stringify({'sid': id});
            $.ajax({
                type: "post",
                data: obj,
                url: "/Admin/Test",
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (result) {
                }, error: function (e) {
                    console.log(e, 'error');
                    alert("unsuccessful");
                }
            });
        }
    </script>
</head>
>
<body>
<h2>Hello World!</h2>
<input type="text" name="studentId" id="studentId"/>
<input type="button" name="insertButton" value="update" onclick="portal()"/>
<br>
</body>
</html>
