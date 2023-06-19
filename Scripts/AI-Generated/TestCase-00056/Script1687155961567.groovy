import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_namespace-for-prefix-xsi-has-not-been-declared-when-using-xmlslurper'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/namespace-for-prefix-xsi-has-not-been-declared-when-using-xmlslurper/55768')

'step 2: Add visual checkpoint at Page_t_namespace-for-prefix-xsi-has-not-been-declared-when-using-xmlslurper'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00056_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
