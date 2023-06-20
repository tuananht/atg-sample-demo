import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_double-double-too-many-decimals'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/double-double-too-many-decimals/32653')

'step 2: Add visual checkpoint at Page_t_double-double-too-many-decimals'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00815_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
