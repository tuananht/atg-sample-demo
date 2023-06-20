import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_using-key-pressing-while-executing-test-suite-via-jenkins-doesnt-work'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/using-key-pressing-while-executing-test-suite-via-jenkins-doesnt-work/10395')

'step 2: Add visual checkpoint at Page_t_using-key-pressing-while-executing-test-suite-via-jenkins-doesnt-work'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00657_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
