import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_update-formula-data-in-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/update-formula-data-in-excel/14091/2')

'step 2: Add visual checkpoint at Page_t_update-formula-data-in-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00138_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()