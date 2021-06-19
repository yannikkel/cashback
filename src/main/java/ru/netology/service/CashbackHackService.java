package ru.netology.service;

public class CashbackHackService {
    private final int boundary;

    {
        boundary = 1000;
    }

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}