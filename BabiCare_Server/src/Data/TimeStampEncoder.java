/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
/**
 *
 * @author Administrator
 */
public class TimeStampEncoder extends MessageToByteEncoder<LoopBackTimeStamp>{
    @Override
  protected void encode(ChannelHandlerContext ctx, LoopBackTimeStamp msg, ByteBuf out) throws Exception {
    out.writeBytes(msg.toByteArray());
  }
}
