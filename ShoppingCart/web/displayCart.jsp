<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Iterator" %>
<html>
<body>
    <h2>Shopping Cart</h2>
    <table border="1">
        <tr>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>Price Per Unit</th>
            <th>Total Price</th>
        </tr>
        <%
            // Assume a simple product database
            Map<String, String> productNames = new HashMap<>();
            productNames.put("1", "Laptop");
            productNames.put("2", "Smartphone");
            productNames.put("3", "Tablet");

            Map<String, Double> productPrices = new HashMap<>();
            productPrices.put("1", 50000.0);  // Laptop price
            productPrices.put("2", 20000.0);  // Smartphone price
            productPrices.put("3", 15000.0);  // Tablet price

            Map<String, Integer> cart = (Map<String, Integer>) session.getAttribute("cart");
            double grandTotal = 0.0;

            if (cart != null) {
                for (Map.Entry<String, Integer> entry : cart.entrySet()) {
                    String productId = entry.getKey();
                    int quantity = entry.getValue();
                    double pricePerUnit = productPrices.get(productId);
                    double totalPrice = quantity * pricePerUnit;
                    grandTotal += totalPrice;
        %>
        <tr>
            <td><%= productNames.get(productId) %></td>
            <td><%= quantity %></td>
            <td><%= pricePerUnit %></td>
            <td><%= totalPrice %></td>
        </tr>
        <%  
                }
            } else {
        %>
        <tr>
            <td colspan="4">Your cart is empty.</td>
        </tr>
        <% } %>
        <tr>
            <td colspan="3"><strong>Grand Total:</strong></td>
            <td><%= grandTotal %></td>
        </tr>
    </table>
</body>
</html>
