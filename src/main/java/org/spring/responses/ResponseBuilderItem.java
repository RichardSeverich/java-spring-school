package org.spring.responses;

import org.spring.models.Item;
import org.spring.services.items.HelperItem;
import org.springframework.http.HttpStatus;

/**
 * Response Builder.
 */
public final class ResponseBuilderItem {

    /**
     * Constructor.
     */
    private ResponseBuilderItem() {

    }

    /**
     * @return responses.
     */
    public static Response<Item> getResponseOkForGet() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.OK)
                .getBody()
                .setTextMessage(ResponseMessage.getSuccessfully(HelperItem.getEntity()))
                .setData(HelperItem.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<Item> getResponseOkForPost() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.CREATED)
                .getBody()
                .setTextMessage(ResponseMessage.createdSuccessfully(HelperItem.getEntity()))
                .setData(HelperItem.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<Item> getResponseOkForPut() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.OK)
                .getBody()
                .setTextMessage(ResponseMessage.updatedSuccessfully(HelperItem.getEntity()))
                .setData(HelperItem.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<Item> getResponseOkForDelete() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.OK)
                .getBody()
                .setTextMessage(ResponseMessage.deletedSuccessfully(HelperItem.getEntity()))
                .setData(null);
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<Item> getResponseConflict() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.CONFLICT)
                .getBody()
                .setTextMessage(ResponseMessage.entityAlreadyExist(HelperItem.getEntity()))
                .setData(HelperItem.getList());
        return response;
    }

    /**
     * @return responses.
     */
    public static Response<Item> getResponseNotFound() {
        Response<Item> response = ResponseManager.getResponseItem();
        response
                .setHttpStatus(HttpStatus.NOT_FOUND)
                .getBody()
                .setTextMessage(ResponseMessage.getNotContent(HelperItem.getEntity()))
                .setData(null);
        return response;
    }
}
