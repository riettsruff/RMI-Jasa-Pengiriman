/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pengiriman.server.service;

import jasa_pengiriman.model.StatusPelacakan;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface StatusPelacakanService extends Remote {
  public List<StatusPelacakan> getAll() throws RemoteException;
}
