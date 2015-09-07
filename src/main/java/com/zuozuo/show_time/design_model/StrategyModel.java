package com.zuozuo.show_time.design_model;

/**
 * Created by zuozuo on 15-8-28.
 */
public class StrategyModel {
    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();
        Strategy strategy = new StrategyA();
        context.setStrategy(strategy);
        context.doSomething();
        Thread.sleep(1000);
        context.setStrategy(new StrategyB());
        context.doSomething();
    }
}

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        this.strategy.whichStrategy();
    }
}

interface Strategy {
    void whichStrategy();
}

class StrategyA implements Strategy {

    public void whichStrategy() {
        System.out.println("I'm A!");
    }
}

class StrategyB implements Strategy {

    public void whichStrategy() {
        System.out.println("I'm B!");
    }
}

class StrategyC implements Strategy {

    public void whichStrategy() {
        System.out.println("I'm C!");
    }
}