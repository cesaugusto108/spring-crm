<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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

            .container {
                width: 70vw;
                margin: 0 auto;
            }

            .input {
                height: 45px;
                width: 355px;
                padding: 0px 20px;
                margin: 0;
                background-color: rgb(247, 244, 244);
                border-radius: 5px;
                border: 1px solid whitesmoke;
            }

            .input::placeholder {
                color: rgb(190, 190, 190);
            }

            .input:hover {
                border: 1px solid lightgray;
            }

            .btn {
                height: 35px;
                padding: 0px 20px;
                margin: 30px 0;
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
                <input type="button" value="Back to Customers" onclick="window.location.href='list/all'; return false;"
                    class="btn" />
            </div>

            <h2>Add a new customer: </h2>

            <div class="container">
                <form:form action="save-customer" modelAttribute="customer" method="POST">
                    <p>First name:</p>
                    <form:input type="text" placeholder="Enter the customer's first name here" path="name.firstName"
                        class="input" />
                    <p>Last name:</p>
                    <form:input type="text" placeholder="Enter the customer's last name here" path="name.lastName"
                        class="input" />
                    <p>Email:</p>
                    <form:input type="text"  placeholder="Enter the customer's email here" path="email" class="input" />

                    <br>
                    <input type="submit" value="Submit" class="btn" />
                </form:form>
            </div>
        </div>
    </body>

    </html>