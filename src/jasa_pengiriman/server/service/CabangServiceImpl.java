/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasa_pengiriman.server.service;

import jasa_pengiriman.model.Cabang;
import jasa_pengiriman.server.dao.CabangDao;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CabangServiceImpl extends UnicastRemoteObject implements CabangService, Serializable {

  public CabangServiceImpl() throws RemoteException {}
  
  @Override
  public List<Cabang> getAll() throws RemoteException {
    return CabangDao.getAll();
  }

  @Override
  public List<Cabang> getByIdKota(int idKota) throws RemoteException {
    return CabangDao.getByIdKota(idKota);
  }

  @Override
  public boolean insert(Cabang cabang) throws RemoteException {
    return CabangDao.insert(cabang);
  }

  @Override
  public boolean update(Cabang cabang) throws RemoteException {
    return CabangDao.update(cabang);
  }

  @Override
  public boolean deleteByIdCabang(int idCabang) throws RemoteException {
    return CabangDao.deleteByIdCabang(idCabang);
  }
  
}
