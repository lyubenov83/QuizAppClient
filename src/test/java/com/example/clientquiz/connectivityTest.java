package com.example.clientquiz;

import java.net.Socket;

class ServerConnectivityChecker {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 8090;

    public static void main(String[] args) {
        if (isServerOnline()) {
            System.out.println("Server is online");
        } else {
            System.out.println("Server is offline");
        }
    }

    private static boolean isServerOnline() {
        try {
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            socket.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}