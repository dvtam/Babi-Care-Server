/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
/**
 *
 * @author Administrator
 */
public class ClientHandler extends ChannelInboundHandlerAdapter{
     @Override
  public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
    LoopBackTimeStamp ts = (LoopBackTimeStamp) msg;
    ctx.writeAndFlush(ts); //recieved message sent back directly
  }
 
  @Override
  public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
    // Close the connection when an exception is raised.
    cause.printStackTrace();
    ctx.close();
  }
}
