package core.basesyntax.service.impl;

import core.basesyntax.model.Operation;
import core.basesyntax.service.interfaces.OperationHandler;
import core.basesyntax.service.interfaces.OperationStrategy;
import java.util.Map;

public class OperationStrategyImpl implements OperationStrategy {
    private final Map<Operation, OperationHandler> operationHandlerMap;

    public OperationStrategyImpl(Map<Operation, OperationHandler> operationHandlerMap) {
        this.operationHandlerMap = operationHandlerMap;
    }

    @Override
    public OperationHandler get(Operation operation) {
        return operationHandlerMap.get(operation);
    }
}