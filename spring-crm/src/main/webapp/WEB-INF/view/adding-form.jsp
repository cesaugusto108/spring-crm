<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Barlow&family=Fredoka+One&display=swap" rel="stylesheet">

    <style>
        body {
            line-height: 1.5;
            font-family: 'Barlow', sans-serif;
            color: #5a5555;
            padding: 0;
            margin: 0;
        }

        h1 {
            font-size: 2.8rem;
        }

        h2 {
            margin-left: 2rem;
        }

        .header {
            background-color: gainsboro;
            padding: 1rem;
            margin-bottom: 1rem;
            display: flex;
            justify-content: space-around;
            align-items: center;
        }

        .btn {
            height: 35px;
            padding: 0px 20px;
            margin: auto 0;
            background-color: rgb(247, 244, 244);
            border-radius: 5px;
            border: none;
            cursor: pointer;
        }

        .btn:hover {
            background-color: #5a5555;
            color: aliceblue;
        }
    </style>

    <title>Add a new customer</title>
</head>

<body>
    <div class="wrapper">
        <div class="header">
            <h1>CRM - Customer Relationship Manager</h1>
            <input type="button" value="Back to Customers"
                onclick="window.location.href='list/all'; return false;" class="btn" />
        </div>

        <h2>Add a new customer: </h2>
    </div>
</body>

</html>