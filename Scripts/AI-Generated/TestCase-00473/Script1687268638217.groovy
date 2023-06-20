import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_passing-feature-file-scenario-tags-at-runtime-when-building-with-jenkins'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/passing-feature-file-scenario-tags-at-runtime-when-building-with-jenkins/36266')

'step 2: Add visual checkpoint at Page_t_passing-feature-file-scenario-tags-at-runtime-when-building-with-jenkins'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00473_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
