import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_connecting-to-mysql-db-with-the-help-of-ssh-tunnel'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/connecting-to-mysql-db-with-the-help-of-ssh-tunnel/48989')

'step 2: Add visual checkpoint at Page_t_connecting-to-mysql-db-with-the-help-of-ssh-tunnel'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00032_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
