package com.gzzsy.backend.repository.util;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

import javax.annotation.Resource;

@Component
public class TxHelper {

    @Resource
    private DataSourceTransactionManager transactionManager;
    @Resource
    private TransactionDefinition transactionDefinition;

    public TransactionStatus startTransaction() {
        return transactionManager.getTransaction(transactionDefinition);
    }

    public void commit(TransactionStatus transactionStatus) {
        if (transactionStatus != null) {
            transactionManager.commit(transactionStatus);
        }
    }

    public void rollbackIfNotCompleted(TransactionStatus transactionStatus) {
        if (transactionStatus != null && !transactionStatus.isCompleted()) {
            transactionManager.rollback(transactionStatus);
        }
    }
}
