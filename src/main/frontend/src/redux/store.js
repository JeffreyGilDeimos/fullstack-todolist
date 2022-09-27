import { configureStore } from "@reduxjs/toolkit";
import todoReducer from './reducers/todoReducer';
import updateReducer from './reducers/updateReducer';
import thunk from "redux-thunk";
import logger from "redux-logger";
import promiseMiddleware from "redux-promise-middleware";
import promise from "redux-promise";

export const store = configureStore({
    reducer: {
        todos: todoReducer,
        update: updateReducer
    },
    middleware: [
        thunk,
        promiseMiddleware,
        promise,
        logger,
    ]
});