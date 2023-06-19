import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_excluding-specific-classes-out-of-the-plugin-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/excluding-specific-classes-out-of-the-plugin-jar/21049/6')

'step 2: Add visual checkpoint at Page_t_excluding-specific-classes-out-of-the-plugin-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00299_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
