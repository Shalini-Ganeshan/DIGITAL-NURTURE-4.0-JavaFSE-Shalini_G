package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String fetchDataById(int id) {
        return api.getDataById(id);
    }

    public void executeAction() {
        api.performAction();
    }

    public void executeRiskyAction() throws Exception {
        api.riskyAction();
    }
}
