import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_mysql-data-fails-to-load-when-executing-from-testops-but-works-locally'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/mysql-data-fails-to-load-when-executing-from-testops-but-works-locally/50584')

'step 2: Add visual checkpoint at Page_t_mysql-data-fails-to-load-when-executing-from-testops-but-works-locally'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00130_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
