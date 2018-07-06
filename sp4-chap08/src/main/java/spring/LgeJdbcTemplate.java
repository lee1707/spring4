//package spring;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.util.List;
//
//public class LgeJdbcTemplate {
//	private Driver driver;
//	/*
//	 * 예를 들면 강은씨가 쓰셨던 것 처럼
//	 * lgeJdbcTemplate.query("select * from blah where email=?", new RowMapper<>() {...}, email);
//	 * 
//	 * 요렇게 쓸 수 있도록?
//	 */
//	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... arguments) {
//		PreparedStatement statement = Connection.createPreparedStatement(sql, arguments);
//		
//		ResultSet rs = statment.execute();
//		
//		List<T> list = new ArrayList<>();
//		int rowNum = 0;
//		while(rs.next()) {
//			T row = rowMapper.mapRow(rs, rowNum);
//			list.add(row);
//			rowNum++;
//		}
//		
//		return list;
//	}
//	
//	public static interface RowMapper<T> {
//		public T mapRow(ResultSet rs, int rowNum);
//	}
//	
//	public static void main(String[] args) {
//		LgeJdbcTemplate template = new LgeJdbcTemplate();
//		List<Member> list = template.query("SELECT * FROM memeber where email=?",
//				new RowMapper<>() 
//			public Member mapRow(ResultSet rs, int rowNum) {
//				Member member = new Member();
//				
//				// member.set...
//				return member;
//			}
//		}, "leegang1707@gmail.com");
//	}
//}
