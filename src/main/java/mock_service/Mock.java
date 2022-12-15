package mock_service;

import models.MockModel;


public abstract class Mock {
    private final MockModel model;

    public Mock(MockModel model) {
        this.model = model;

    }
}
