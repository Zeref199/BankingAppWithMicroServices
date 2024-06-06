package com.easybytes.accounts.service;

import com.easybytes.accounts.dto.CustomerDto;

public interface IAccountService {
    /**
     *
     * @param customerDto-CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
}
