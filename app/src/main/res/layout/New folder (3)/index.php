<!DOCTYPE html>
<html lang="en">
		<head>
		<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
	</head>
<body>
	<nav class="navbar navbar-default">
	
	</nav>
	<div class="col-md-3"></div>
	<div class="col-md-6 well">
		<h3 class="text-primary"><center>Sales Record</center></h3>
		<hr style="border-top:1px dotted #ccc;"/>
		<br /><br />
		<table class="table table-bordered">
			<thead class="alert-info">
				<tr>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Year</th>
					<th>Section</th>
				</tr>
			</thead>
			<tbody>
				<?php
				require 'conn.php';

				    $query = mysqli_query($conn, "SELECT * FROM `student`") or die(mysqli_error());
					while($fetch = mysqli_fetch_array($query)){
				?>
				<tr>
					<td><?php echo $fetch['firstname']?></td>
					<td><?php echo $fetch['lastname']?></td>
					<td><?php echo $fetch['year']?></td>
					<td><?php echo $fetch['section']?></td>
				</tr>
				<?php
					}
				?>
			</tbody>
			<tfoot>
				
			</tfoot>
		</table>
		
			<a class="btn btn-info" href="export_excel.php">Save as Excel</a>
	</div>

<script src="js/jquery-3.2.1.min.js"></script>	
<script src="js/bootstrap.js"></script>	
</body>	
</html>