$(function () {
    var websocket;

    function setupWebSocket() {
        var userName = $("#userName").val();
        if (userName && websocket === undefined) {  // Only setup WebSocket if not already open
            var uri = "ws://" + document.location.host + '/WebSocketDemoProject/connect/' + userName;
            websocket = new WebSocket(uri);
            
            websocket.onmessage = function (evt) {
                var time = new Date().toLocaleTimeString();
                print("Received at " + time + ": " + evt.data);
            };
            
            websocket.onopen = function (evt) {
                console.log("WebSocket connection opened:", evt);
            };
            
            websocket.onerror = function (evt) {
                console.error("WebSocket error:", evt);
            };
            
            websocket.onclose = function (evt) {
                console.log("WebSocket connection closed:", evt);
                websocket = undefined; // Reset websocket variable when connection is closed
            };
        }
    }

    // Blur event for userName input field to setup WebSocket connection
    $("#userName").blur(function () {
        if ($("#userName").val().trim() !== "") {
            setupWebSocket();
        }
    });

    // Click event for the button to send a message via WebSocket
    $("#button").click(function () {
        var message = $("#message").val();
        if (message.trim() !== "") {
            var time = new Date().toLocaleTimeString();
            websocket.send(message);
            print("Sent at " + time + ": " + message);
            $("#message").val('');  // Clear input field after sending
        } else {
            console.log("Message is empty, not sent.");
        }
    });

    // Function to print messages to the message area
    function print(message) {
        var messageArea = document.getElementById("messages");
        var label = document.createElement('p');
        label.style.wordWrap = "break-word";
        label.innerHTML = message;
        messageArea.appendChild(label);
    }
});
