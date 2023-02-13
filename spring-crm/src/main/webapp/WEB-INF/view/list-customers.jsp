<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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

            table {
                padding: 1rem;
                width: 75%;
                margin: 0 auto;
                border: 1px solid gainsboro;
                border-radius: 5px;
            }

            thead {
                background-color: rgb(247, 244, 244);
            }
            
            th {
                padding: 1rem;
                border-radius: 5px;
            }

            tr {
                text-align: center;
            }

            td {
                padding: 0.8rem;
                border-bottom: 1px solid rgb(247, 244, 244);
            }

            .header {
                background-color: gainsboro;
                padding: 1rem;
                margin-bottom: 1rem;
                display: flex;
                justify-content: center;
            }

            .container {
                width: 70vw;
                margin: 0 auto;
            }
        </style>

        <title>Customers list</title>
    </head>

    <body>
        <div class="wrapper">
            <div class="header">
                <h1>CRM - Customer Relationship Manager</h1>
            </div>
        </div>
        <div class="container">
            <div class="content">
                <table>
                    <thead>
                        <tr>
                            <th>First name</th>
                            <th>Last name</th>
                            <th>Email</th>
                        </tr>
                    </thead>

                    <tbody>
                        <c:forEach var="customer" items="${customers}">
                            <tr>
                                <td>${customer.name.firstName}</td>
                                <td>${customer.name.lastName}</td>
                                <td>${customer.email}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>

    </html>