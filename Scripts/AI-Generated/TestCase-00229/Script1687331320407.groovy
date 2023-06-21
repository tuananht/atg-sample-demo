import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_jquery-error-is-not-defined'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/jquery-error-is-not-defined/58908')

'step 2: Add visual checkpoint at Page_t_jquery-error-is-not-defined'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00229_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
