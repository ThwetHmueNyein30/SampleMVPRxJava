package com.example.samplemvprxapp.data.model

import com.example.samplemvprxapp.network.data_agent.DataAgentImpl

abstract class BaseModel {

    protected val dataAgent=DataAgentImpl
}